<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SignIpContractRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 订单合同文件OSS文件key
    /**
     * @var string
     */
    public $contractFileUrl;

    // 签署区信息
    /**
     * @var SignField[]
     */
    public $signFields;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'contractFileUrl'   => 'contract_file_url',
        'signFields'        => 'sign_fields',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('contractFileUrl', $this->contractFileUrl, true);
        Model::validateRequired('signFields', $this->signFields, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->contractFileUrl) {
            $res['contract_file_url'] = $this->contractFileUrl;
        }
        if (null !== $this->signFields) {
            $res['sign_fields'] = [];
            if (null !== $this->signFields && \is_array($this->signFields)) {
                $n = 0;
                foreach ($this->signFields as $item) {
                    $res['sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignIpContractRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['contract_file_url'])) {
            $model->contractFileUrl = $map['contract_file_url'];
        }
        if (isset($map['sign_fields'])) {
            if (!empty($map['sign_fields'])) {
                $model->signFields = [];
                $n                 = 0;
                foreach ($map['sign_fields'] as $item) {
                    $model->signFields[$n++] = null !== $item ? SignField::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
