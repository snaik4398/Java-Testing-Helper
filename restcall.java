package com.karkinos.casemanagement.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.karkinos.mdm.admin.vo.userdefinedstate.UserDefinedState;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class testing {
	public static RestTemplate restTemplate = new RestTemplate();
	public static String mdmUrl = "https://api.sit.karkinos.in";
	public static String Authorization = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJjY19tczB2ZjE4RHVtQ3NXSTF3a2ZwVXF6RHFqTDhueE5jeWlEZGl2VktFIn0.eyJleHAiOjE3MDk4ODI1MjUsImlhdCI6MTcwOTg4MDcyNSwianRpIjoiN2JmMWVkMjQtZDI4Mi00N2JjLWJlYzYtOTE3YTVmOWRmODBlIiwiaXNzIjoiaHR0cHM6Ly9hdXRoLnNpdC5rYXJraW5vcy5pbi9hdXRoL3JlYWxtcy9rYXJraW5vcyIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiIxYzU5NzNiNy0yN2RlLTQ0NGUtYWQ3Ny01MDE4ZjdlNDc3ODgiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJrb25nIiwic2Vzc2lvbl9zdGF0ZSI6IjkwN2I1ZGFmLTUwYzQtNDQ3OC04NGMwLTBiZGY3YzVjZjEyYyIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9hcGkuc2l0Lmthcmtpbm9zLmluIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJleHBlcnQiLCJrYXJlbWl0cmEiLCJrb25nX2V4cGVydCIsInNtYWxsLWNsaW5pYy11c2VyIiwiYWRtaW4tcG9ydGFsLW1hbmFnZXIiLCJjb21tYW5kX2NlbnRlciIsInByYWN0aXRpb25lciIsImFkbWluIiwidGFzay1jb25maWctYWRtaW4iLCJkZWxldGVfcm9sZSIsIm1pZ3JhdGlvbi1lbmRwb2ludC1yb2xlIiwiZGF0YS1zeW5jLWFkbWluIiwibWFuYWdlLXVpLXRlbXBsYXRlIiwia2RzLWRldmVsb3BlcnMiLCJ1bmxvY2stdXNlciIsImRhdGEtbWFuYWdlciIsInRlbGUtcmFkaW9sb2d5LWFkbWluIiwidmlwLWFjY2VzcyIsIm1lcmdlLXBhdGllbnQiLCJ1c2VyIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJtaWdyYXRpb24tZW5kcG9pbnQtc2NvcGUga29uZ19jb21tYW5kX2NlbnRlciBrb25nX2thcmVtaXRyYSBrb25nX3VzZXIga29uZ19hZG1pbiBwcm9maWxlIGtvbmdfZXhwZXJ0IGVtYWlsIGtvbmdfZGVsZXRlX3JvbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpveWRlZXAgU2Fya2FyIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2FrZXQubGFraHBhdGlAa2Fya2lub3MuaW4iLCJnaXZlbl9uYW1lIjoiSm95ZGVlcCIsImZhbWlseV9uYW1lIjoiU2Fya2FyIiwiZW1haWwiOiJqb3lkZWVwLnNhcmthckBnbWFpbC5jb20ifQ.aqMfKeAEyV6oBGET6W9gngxqsoFWI1Xe2s-SRAfRNshBuRMqN9xHHv-YkNLy3lGovnqvsLBlG-3SS2nJiefyRIVkna1skOMo8WUXBAby8anZjqaSJfwX91cafV6PPENjDmYGvZNSXFhGI5gfrGnne4T1ymBThXA8fIGbdbl-wcwIK2xXNuUnwlgNQTcYaT5gDMuiGOPjKod0sUKpQUwuDpbX6OpRJR7nLDqnBdxUUKbov83Xo9bp6UzPd4sFx1SNux3RT89v2IU255jB1GFmVn1vb5OelxR6duCelqlUQRpo2Hbr5zPRrtjv5kV2xC2-h2BLwkJJHJd9B0WKdfucrg";

	public static void main(String[] args) {

		// @Value("${mdm.savepatient.url}")
		try {
			UserDefinedState k = getStateByReferenceTypeAndStateIds("FOLLOW_UP", "ENCOUNTER_TYPE",
					"ENCOUNTER_TYPE_FOLLOW_UP_COMPLETED");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static UserDefinedState getStateByReferenceTypeAndStateIds(String referenceId, String referenceTypeId,
			String stateId) {
		try {
//			HttpHeaders headers = new HttpHeaders();
			List<MediaType> acceptTypes = new ArrayList<>();
			acceptTypes.add(MediaType.APPLICATION_JSON);
//			headers.setAccept(acceptTypes);
//			try {
//				if (StringUtils.isNotBlank(Authorization)) {
//					headers.add("Authorization", Authorization);
//				}
//			} catch (Exception exception) {
//				log.debug("RestUtils::getDefaultStateByRefernceTypeId:: exception getting authorization header: {}",
//						exception);
//			}
//			HttpEntity<Void> entity = new HttpEntity<>(headers);

//			ResponseEntity<UserDefinedState> response = restTemplate.exchange(
//					mdmUrl + "/mdm-admin/user-definded-states/by-reference-id-and-reference-type-id-and-state-id/"
//							+ referenceId + "/" + referenceTypeId + "/" + stateId,
//					HttpMethod.GET, entity, UserDefinedState.class);

//			HttpEntity<List<String>> request = new HttpEntity<>(encounterTypeIds, headers);
//			UserDefinedState userDefinedState = restTemplate.getForObject(
//					mdmUrl + "/mdm-admin/user-definded-states/by-reference-id-and-reference-type-id-and-state-id/"
//							+ referenceId + "/" + referenceTypeId + "/" + stateId,
//					UserDefinedState.class);
//			log.debug("RestUtils:: getEncounterTypeNamesByIds called");
//			Map<String, String> encounterTypeNameAndIdMap = restTemplate
//					.postForObject(mdmUrl + "/mdm-admin/encountertype/names", request, Map.class);
//			log.debug("RestUtils:: getEncounterTypeNamesByIds:: response from mdm encounterType names: {}",
//					(encounterTypeIds == null ? "Not found" : "Found"));
//			
//		     String url = mdmUrl + "/mdm-admin/user-definded-states/by-reference-id-and-reference-type-id-and-state-id/"
//		             + referenceId + "/" + referenceTypeId + "/" + stateId;
//		         
//		         UserDefinedState userDefinedState = restTemplate.getForObject(url, UserDefinedState.class);
//
//		         return userDefinedState;
//			return response.getBody();
		         
		         
		         HttpHeaders headers = new HttpHeaders();
		         headers.set("Authorization", "Bearer " + Authorization); // Add Authorization header with token

		         // Pass the HttpHeaders object containing the authorization header to the getForObject method
		         UserDefinedState userDefinedState = restTemplate.getForObject(
		             mdmUrl + "/mdm-admin/user-definded-states/by-reference-id-and-reference-type-id-and-state-id/"
		             + referenceId + "/" + referenceTypeId + "/" + stateId,
		             UserDefinedState.class,
		             headers
		         );
		         
					return userDefinedState;
				} catch (Exception exception) {
			log.error("RestUtils::getRelatedUserForPatientId:: referenceId:{}, referenceTypeId:{}, exception!",
					referenceId, referenceTypeId, exception);
			return null;
		}
	}
}
