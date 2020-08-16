package com.github.instagram4j.instagram4j.requests.direct;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.requests.IGGetRequest;
import com.github.instagram4j.instagram4j.responses.direct.DirectThreadsResponse;
import com.github.instagram4j.instagram4j.utils.IGUtils;

public class DirectGetByParticipantsRequest extends IGGetRequest<DirectThreadsResponse> {
    private Long[] _participants;

    public DirectGetByParticipantsRequest(Long... participants) {
        this._participants = participants;
    }

    @Override
    public String path() {
        return "direct_v2/threads/get_by_participants/";
    }

    @Override
    public String getQueryString(IGClient client) {
        return mapQueryString("recipient_users", IGUtils.objectToJson(_participants));
    }

    @Override
    public Class<DirectThreadsResponse> getResponseType() {
        return DirectThreadsResponse.class;
    }

}
