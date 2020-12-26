package ru.netology.domain;

import java.util.Date;

public class Post {
    private long id;
    private long ownerId;
    private String logoUrl;
    private String ownerName;
    private Date date;
    private String imageUrl;
    private String title;
    private String briefContent;
    private boolean isInBookmarks;
    private int likesCount;
    private boolean isLikedByMe;
    private int commentsCount;
    private boolean isCommentedByMe;
    private int repostCount;
    private boolean isRepostedByMe;
    private int viewsCount;
}
