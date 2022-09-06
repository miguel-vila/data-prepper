/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.peerforwarder.server;

import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.common.MediaType;

import java.util.Objects;

/**
 * Class to handle exceptions while processing HTTP POST requests by {@link PeerForwarderHttpService}
 * and sends back the HTTP response based on exception
 * @since 2.0
 */
public class ResponseHandler {

    public HttpResponse handleException(final Exception e, final String message) {
        Objects.requireNonNull(message);

        return HttpResponse.of(HttpStatus.INTERNAL_SERVER_ERROR, MediaType.ANY_TYPE, message);
    }
}
