<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ConfigmapSecretVolumeSource extends Model
{
    // 引用volume名称。
    /**
     * @example test-config
     *
     * @var string
     */
    public $volumeRefName;
    protected $_name = [
        'volumeRefName' => 'volume_ref_name',
    ];

    public function validate()
    {
        Model::validateRequired('volumeRefName', $this->volumeRefName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->volumeRefName) {
            $res['volume_ref_name'] = $this->volumeRefName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigmapSecretVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['volume_ref_name'])) {
            $model->volumeRefName = $map['volume_ref_name'];
        }

        return $model;
    }
}
