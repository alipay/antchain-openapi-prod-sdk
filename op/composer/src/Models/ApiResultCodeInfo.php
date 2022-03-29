<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiResultCodeInfo extends Model
{
    // 返回结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $internalCode;

    // 外部结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // 返回结果描述
    /**
     * @example error
     *
     * @var string
     */
    public $description;

    // 返回结果码解决方案
    /**
     * @example error
     *
     * @var string
     */
    public $resolution;
    protected $_name = [
        'internalCode' => 'internal_code',
        'code'         => 'code',
        'description'  => 'description',
        'resolution'   => 'resolution',
    ];

    public function validate()
    {
        Model::validateRequired('internalCode', $this->internalCode, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('resolution', $this->resolution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->internalCode) {
            $res['internal_code'] = $this->internalCode;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiResultCodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['internal_code'])) {
            $model->internalCode = $map['internal_code'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['resolution'])) {
            $model->resolution = $map['resolution'];
        }

        return $model;
    }
}
