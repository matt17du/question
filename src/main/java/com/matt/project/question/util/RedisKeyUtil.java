package com.matt.project.question.util;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author matt
 * @create 2021-01-12 16:58
 */
public class RedisKeyUtil {

    private static String SPLIT = ":";

    private static String BIZ_LIKE = "LIKE";

    private static String BIZ_DISLIKE = "DISLIKE";

    private static String BIZ_EVENTQUEUE = "EVENT_QUEUE";

    private static String BIZ_FOLLOWER = "FOLLOWER";

    private static String BIZ_FOLLOWEE = "FOLLOWEE";

    private static String BIZ_TIMELINE = "TIMELINE";

    public static String getLikeKey(Integer entityType, Integer entityId) {
        return BIZ_LIKE + SPLIT + String.valueOf(entityType) + SPLIT
                + String.valueOf(entityId);
    }

    public static String getDisLikeKey(Integer entityType, Integer entityId) {
        return BIZ_DISLIKE + SPLIT + String.valueOf(entityType) + SPLIT
                + String.valueOf(entityId);
    }

    public static String getEventQueueKey() {
        return BIZ_EVENTQUEUE;
    }

    public static String getFollowerKey(Integer entityType,
                                        Integer entityId) {
        return BIZ_FOLLOWER + SPLIT + entityType + SPLIT + entityId;
    }

    /**
     * 功能：某个用户关注某类事务
     * @author matt
     * @date 2021/1/14
     * @param entityType
     * @param userId
     * @return java.lang.String
    */
    public static String getFolloweeKey(Integer entityType, Integer userId) {
        return BIZ_FOLLOWEE + SPLIT + entityType + SPLIT + userId;
    }

    public static String getTimeLine(Integer userId) {
        return BIZ_TIMELINE + SPLIT + userId;
    }

}
