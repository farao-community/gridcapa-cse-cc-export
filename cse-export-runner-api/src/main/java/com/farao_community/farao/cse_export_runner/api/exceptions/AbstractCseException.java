/*
 * Copyright (c) 2022, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.farao_community.farao.cse_export_runner.api.exceptions;

/**
 * Custom abstract exception to be extended by all application exceptions.
 * Any subclass may be automatically wrapped to a JSON API error message if needed
 *
 * @author Amira Kahya {@literal <amira.kahya at rte-france.com>}
 */
public abstract class AbstractCseException extends RuntimeException  {
    protected AbstractCseException(String message) {
        super(message);
    }

    protected AbstractCseException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public abstract int getStatus();

    public abstract String getCode();

    public final String getTitle() {
        return getMessage();
    }

    public final String getDetails() {
        String message = getMessage();
        if (message != null) {
            StringBuilder sb = new StringBuilder(message);
            Throwable cause = getCause();
            while (cause != null) {
                sb.append("; nested exception is ").append(cause);
                cause = cause.getCause();
            }
            return sb.toString();
        } else {
            return "No details";
        }
    }
}
