<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ResultCodeRequest extends Model
{
    // api版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apiVersion;

    // api名称
    /**
     * @example test
     *
     * @var string
     */
    public $apiName;

    // 外部返回结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // 内部返回结果码
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $internalCode;

    // 结果码描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 错误解决方法
    /**
     * @example ERROR
     *
     * @var string
     */
    public $resolution;
    protected $_name = [
        'apiVersion'   => 'api_version',
        'apiName'      => 'api_name',
        'code'         => 'code',
        'internalCode' => 'internal_code',
        'description'  => 'description',
        'resolution'   => 'resolution',
    ];

    public function validate()
    {
        Model::validateRequired('apiVersion', $this->apiVersion, true);
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('internalCode', $this->internalCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->internalCode) {
            $res['internal_code'] = $this->internalCode;
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
     * @return ResultCodeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['internal_code'])) {
            $model->internalCode = $map['internal_code'];
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
