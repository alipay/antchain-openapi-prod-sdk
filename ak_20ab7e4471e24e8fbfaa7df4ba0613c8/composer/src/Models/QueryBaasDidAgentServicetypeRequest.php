<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasDidAgentServicetypeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 查询者did
    /**
     * @var string
     */
    public $did;

    // 指定查询的服务类型名
    /**
     * @var string
     */
    public $serviceType;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 服务类型定义列表
    /**
     * @var string[]
     */
    public $serviceTypes;

    // 总共有几项
    /**
     * @var int
     */
    public $totalNumber;

    // 总共有几页
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'serviceType'       => 'service_type',
        'bizCode'           => 'biz_code',
        'serviceTypes'      => 'service_types',
        'totalNumber'       => 'total_number',
        'totalPage'         => 'total_page',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->serviceTypes) {
            $res['service_types'] = $this->serviceTypes;
        }
        if (null !== $this->totalNumber) {
            $res['total_number'] = $this->totalNumber;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBaasDidAgentServicetypeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['service_types'])) {
            if (!empty($map['service_types'])) {
                $model->serviceTypes = $map['service_types'];
            }
        }
        if (isset($map['total_number'])) {
            $model->totalNumber = $map['total_number'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
