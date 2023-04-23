<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerStandardContractVersion extends Model
{
    // 协议名称
    /**
     * @example 协议名称
     *
     * @var string
     */
    public $name;

    // 协议可预览地址
    /**
     * @example http://oss-xxxx
     *
     * @var string
     */
    public $previewUrl;

    // 协议版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'name'       => 'name',
        'previewUrl' => 'preview_url',
        'version'    => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('previewUrl', $this->previewUrl, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->previewUrl) {
            $res['preview_url'] = $this->previewUrl;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerStandardContractVersion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['preview_url'])) {
            $model->previewUrl = $map['preview_url'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
