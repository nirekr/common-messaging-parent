/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 */

package com.dell.cpsd.common.logging;

import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * This interface should be implemented by any class that acts as a logger.
 * <p>
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 * </p>
 *
 * @version 1.0
 * @since SINCE-TDB
 */
public interface ILogger extends Serializable
{
    // TODO : add variable arguments once initial cut of code is in place

    /**
     * This returns true if the debug logging level is enabled.
     *
     * @return True if the debug logging level is enabled.
     * @since SINCE-TDB
     */
    boolean isDebugEnabled();

    /**
     * This logs the message at the debug level.
     *
     * @param message The message to log.
     * @since SINCE-TDB
     */
    void debug(String message);

    /**
     * This returns true if the trace logging level is enabled.
     *
     * @return True if the trace logging level is enabled.
     * @since SINCE-TDB
     */
    boolean isTraceEnabled();

    /**
     * This logs the message at the trace level.
     *
     * @param message The message to log.
     * @since SINCE-TDB
     */
    void trace(String message);

    /**
     * This returns true if the information logging level is enabled.
     *
     * @return True if the information logging level is enabled.
     * @since SINCE-TDB
     */
    boolean isInfoEnabled();

    /**
     * This logs the message at the information level.
     *
     * @param message The message to log.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String info(String message);

    /**
     * This logs the message at the information level.
     *
     * @param message The message to log.
     * @param params  The message parameters.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String info(String message, Object[] params);

    /**
     * This logs the message at the warning level.
     *
     * @param message The message to log.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String warn(String message);

    /**
     * This logs the message at the warning level.
     *
     * @param message The message to log.
     * @param params  The message parameters.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String warn(String message, Object[] params);

    /**
     * This logs the message at the error level.
     *
     * @param message The message to log.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String error(String message);

    /**
     * This logs the message at the error level.
     *
     * @param message The message to log.
     * @param params  The message parameters.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String error(String message, Object[] params);

    /**
     * This logs the message at the error level.
     *
     * @param message The message to log.
     * @param thrown  The exception that was thrown.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String error(String message, Throwable thrown);

    /**
     * This logs the message at the error level.
     *
     * @param message The message to log.
     * @param params  The message parameters.
     * @param thrown  The exception that was thrown.
     * @return The localized message.
     * @since SINCE-TDB
     */
    String error(String message, Object[] params, Throwable thrown);

    /**
     * This sets the resource bundle for this logger.
     *
     * @param resourceBundle The <code>ResourceBundle</code> for this logger.
     * @since SINCE-TDB
     */
    void setResourceBundle(ResourceBundle resourceBundle);

}
