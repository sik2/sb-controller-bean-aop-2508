package com.back.stadard.util.service;

import lombok.RequiredArgsConstructor;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkdownService {
    private final HtmlRenderer htmlRenderer;
    private final Parser parser;

    public String toHtml(String markdown) {
        // 문자열을 파싱해서 Node 트리 구조로 변환
        Node document = parser.parse(markdown);

        // Node를 HTML 문자열로 렌더링
        return htmlRenderer.render(document);
    }
}
