package com.github.instagram4j.instagram4j.requests.media;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.requests.IGGetRequest;
import com.github.instagram4j.instagram4j.requests.IGPaginatedRequest;
import com.github.instagram4j.instagram4j.responses.media.MediaGetCommentsResponse;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
public class MediaGetCommentsRequest extends IGGetRequest<MediaGetCommentsResponse>
        implements IGPaginatedRequest {
    @NonNull
    private String _id;
    @Setter
    private String max_id;

    @Override
    public String path() {
        return "media/" + _id + "/comments/";
    }

    @Override
    public String getQueryString(IGClient client) {
        if (max_id != null) {
            String queryString = "?min_id=" + max_id;
            return queryString;
        } else {
            return "";
        }
    }

    @Override
    public Class<MediaGetCommentsResponse> getResponseType() {
        return MediaGetCommentsResponse.class;
    }
}
