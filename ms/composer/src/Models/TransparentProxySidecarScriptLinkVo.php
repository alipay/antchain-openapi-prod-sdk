<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxySidecarScriptLinkVo extends Model
{
    // 安装sidecar下载链接
    /**
     * @example http://xxxx
     *
     * @var string
     */
    public $installSidecarScriptLink;

    // 清理sidecar脚本下载链接
    /**
     * @example http://xxxx
     *
     * @var string
     */
    public $cleanSidecarScriptLink;
    protected $_name = [
        'installSidecarScriptLink' => 'install_sidecar_script_link',
        'cleanSidecarScriptLink'   => 'clean_sidecar_script_link',
    ];

    public function validate()
    {
        Model::validateRequired('installSidecarScriptLink', $this->installSidecarScriptLink, true);
        Model::validateRequired('cleanSidecarScriptLink', $this->cleanSidecarScriptLink, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->installSidecarScriptLink) {
            $res['install_sidecar_script_link'] = $this->installSidecarScriptLink;
        }
        if (null !== $this->cleanSidecarScriptLink) {
            $res['clean_sidecar_script_link'] = $this->cleanSidecarScriptLink;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxySidecarScriptLinkVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['install_sidecar_script_link'])) {
            $model->installSidecarScriptLink = $map['install_sidecar_script_link'];
        }
        if (isset($map['clean_sidecar_script_link'])) {
            $model->cleanSidecarScriptLink = $map['clean_sidecar_script_link'];
        }

        return $model;
    }
}
