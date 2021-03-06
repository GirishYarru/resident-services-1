/**
 * 
 */
package io.mosip.resident.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.mosip.resident.constant.IdType;
import lombok.Data;

/**
 * @author M1022006
 *
 */
@Data
@JsonPropertyOrder({ "transactionID", "individualId", "individualIdType", "otp", "authType" })
public class AuthLockOrUnLockRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String transactionID;
	private String individualId;
    private String individualIdType;
    private String otp;
	private List<String> authType;

}
