<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ApiInfoModel extends Model
{
    // API名称
    /**
     * @example demo.abc.abc.query
     *
     * @var string
     */
    public $apiName;

    // 网关产品码
    /**
     * @example demo
     *
     * @var string
     */
    public $prodCode;

    // 是否是内部接口 0对外 1对内
    /**
     * @example 1
     *
     * @var int
     */
    public $internal;

    // API版本号
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apiVersion;

    // API描述
    /**
     * @example 测试用接口
     *
     * @var string
     */
    public $apiDesc;

    // api所属网关产品id
    /**
     * @example test
     *
     * @var string
     */
    public $providerId;
    protected $_name = [
        'apiName'    => 'api_name',
        'prodCode'   => 'prod_code',
        'internal'   => 'internal',
        'apiVersion' => 'api_version',
        'apiDesc'    => 'api_desc',
        'providerId' => 'provider_id',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('internal', $this->internal, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
        Model::validateRequired('apiDesc', $this->apiDesc, true);
        Model::validateRequired('providerId', $this->providerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->internal) {
            $res['internal'] = $this->internal;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->apiDesc) {
            $res['api_desc'] = $this->apiDesc;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiInfoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['internal'])) {
            $model->internal = $map['internal'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['api_desc'])) {
            $model->apiDesc = $map['api_desc'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }

        return $model;
    }
}
