<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AgentVersion extends Model
{
    // 版本号
    /**
     * @example v1.0
     *
     * @var string
     */
    public $version;

    // 存储url
    /**
     * @example http://xxxx
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'version' => 'version',
        'url'     => 'url',
    ];

    public function validate()
    {
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentVersion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
