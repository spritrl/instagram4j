package com.github.instagram4j.instagram4j.requests.media;

import com.github.instagram4j.instagram4j.requests.IGGetRequest;
import com.github.instagram4j.instagram4j.responses.feed.FeedUsersResponse;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaGetLikersRequest extends IGGetRequest<FeedUsersResponse> {
    @NonNull
    private String _id;
    private String nextMinId;

    public MediaGetLikersRequest(String _id, String nextMinId) {
        this._id = _id;
        this.nextMinId = nextMinId;
    }

    @Override
    public String path() {
        return nextMinId == null ? "media/" + _id + "/likers/" : "media/" + _id + "/likers/?max_id=" + nextMinId;
    }

    @Override
    public Class<FeedUsersResponse> getResponseType() {
        return FeedUsersResponse.class;
    }
}