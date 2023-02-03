/*
 * Copyright (c) 2023.  Inditex 
 */

package me.snowdrop.boot.narayana.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @since 3.0.0
 */
@ConfigurationProperties(prefix = "spring.jta", ignoreUnknownFields = true)
public class JtaProperties {
  
  /**
	 * Transaction logs directory.
	 */
	private String logDir;

	/**
	 * Transaction manager unique identifier.
	 */
	private String transactionManagerId;

	public void setLogDir(String logDir) {
		this.logDir = logDir;
	}

	public String getLogDir() {
		return this.logDir;
	}

	public String getTransactionManagerId() {
		return this.transactionManagerId;
	}

	public void setTransactionManagerId(String transactionManagerId) {
		this.transactionManagerId = transactionManagerId;
	}

}
