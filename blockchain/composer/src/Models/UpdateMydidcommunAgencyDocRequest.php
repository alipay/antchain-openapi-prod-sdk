<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateMydidcommunAgencyDocRequest extends Model
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

    // 入驻时候生成的did
    /**
     * @var string
     */
    public $did;

    // 对参数进行构造签名
    /**
     * @var string
     */
    public $operationSign;

    // doc当前版本
    /**
     * @var int
     */
    public $preVersion;

    // doc中服务信息列表
    /**
     * @var DisServicesInfo[]
     */
    public $serviceList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'operationSign'     => 'operation_sign',
        'preVersion'        => 'pre_version',
        'serviceList'       => 'service_list',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('operationSign', $this->operationSign, true);
        Model::validateRequired('preVersion', $this->preVersion, true);
        Model::validateRequired('serviceList', $this->serviceList, true);
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
        if (null !== $this->operationSign) {
            $res['operation_sign'] = $this->operationSign;
        }
        if (null !== $this->preVersion) {
            $res['pre_version'] = $this->preVersion;
        }
        if (null !== $this->serviceList) {
            $res['service_list'] = [];
            if (null !== $this->serviceList && \is_array($this->serviceList)) {
                $n = 0;
                foreach ($this->serviceList as $item) {
                    $res['service_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMydidcommunAgencyDocRequest
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
        if (isset($map['operation_sign'])) {
            $model->operationSign = $map['operation_sign'];
        }
        if (isset($map['pre_version'])) {
            $model->preVersion = $map['pre_version'];
        }
        if (isset($map['service_list'])) {
            if (!empty($map['service_list'])) {
                $model->serviceList = [];
                $n                  = 0;
                foreach ($map['service_list'] as $item) {
                    $model->serviceList[$n++] = null !== $item ? DisServicesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
