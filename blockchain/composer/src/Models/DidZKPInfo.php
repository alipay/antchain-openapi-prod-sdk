<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidZKPInfo extends Model
{
    // 需要生成证明的路径
    /**
     * @example "$./path"
     *
     * @var string
     */
    public $path;

    // 生成ZKP证明的公共信息
    /**
     * @example json array string
     *
     * @var string
     */
    public $publicInputs;

    // zkp方法
    /**
     * @example more,less,contain
     *
     * @var string
     */
    public $zkpType;
    protected $_name = [
        'path'         => 'path',
        'publicInputs' => 'public_inputs',
        'zkpType'      => 'zkp_type',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('publicInputs', $this->publicInputs, true);
        Model::validateRequired('zkpType', $this->zkpType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->publicInputs) {
            $res['public_inputs'] = $this->publicInputs;
        }
        if (null !== $this->zkpType) {
            $res['zkp_type'] = $this->zkpType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidZKPInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['public_inputs'])) {
            $model->publicInputs = $map['public_inputs'];
        }
        if (isset($map['zkp_type'])) {
            $model->zkpType = $map['zkp_type'];
        }

        return $model;
    }
}
