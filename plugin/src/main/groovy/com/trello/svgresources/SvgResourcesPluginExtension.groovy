package com.trello.svgresources

class SvgResourcesPluginExtension {
    /** Base DPI of SVG assets */
    int svgDpi = 72

    /** Densities to exclude when generating SVG assets (ldpi, mdpi, hdpi, xhdpi, xxhdpi, or xxxhpdi) */
    List<String> excludeDensities = []
}
