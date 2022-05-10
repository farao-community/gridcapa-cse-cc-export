package com.farao_community.farao.cse_export_runner.app.configurations;

import java.util.List;

/**
 * @author Joris Mancini {@literal <joris.mancini at rte-france.com>}
 */
public class PisaLinkProperties {
    private final String nodeFr;
    private final String nodeIt;
    private final List<String> fictiveLines;

    public PisaLinkProperties(String nodeFr, String nodeIt, List<String> fictiveLines) {
        this.nodeFr = nodeFr;
        this.nodeIt = nodeIt;
        this.fictiveLines = fictiveLines;
    }

    public String getNodeFr() {
        return nodeFr;
    }

    public String getNodeIt() {
        return nodeIt;
    }

    public List<String> getFictiveLines() {
        return fictiveLines;
    }
}
