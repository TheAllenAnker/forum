package com.delicate.forum.util;

public interface ForumConstant {
    int ACTIVATION_SUCCESS = 0;

    int ACTIVATION_REPEAT = 1;

    int ACTIVATION_FAILURE = 2;

    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 7;

    /**
     * Entity Type: Post
     */
    int ENTITY_POST = 1;

    /**
     * Entity Type: Comment
     */
    int ENTITY_COMMENT = 2;
}
