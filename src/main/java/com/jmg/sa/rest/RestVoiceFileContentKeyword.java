/**
 * 
 */
package com.jmg.sa.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmg.sa.domain.VoiceFileKeyword;
import com.jmg.sa.service.VoiceFileKeywordService;

/**
 * @author Javier Moreno Garcia
 *
 */
@RestController
@RequestMapping("/api/files")
public class RestVoiceFileContentKeyword {

    @Inject
    private VoiceFileKeywordService voiceFileKeywordService;

    @RequestMapping(value = "/{voiceFileId}/keywords", method = GET)
    public Page<VoiceFileKeyword> list(@PathVariable Long voiceFileId, Pageable pageable) {
        
     // execute service
        return voiceFileKeywordService.listFiles(voiceFileId, pageable); 
    }

}