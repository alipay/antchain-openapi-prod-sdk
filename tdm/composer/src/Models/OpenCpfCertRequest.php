<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class OpenCpfCertRequest extends Model
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

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 证明类型
    /**
     * @var string
     */
    public $issueCertType;

    // 公积金中心ID
    /**
     * @var string
     */
    public $providerId;

    // 数据拥有者ID（身份证ID）
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 数据拥有者姓名（真实姓名）
    /**
     * @var string
     */
    public $dataOwnerName;

    // 请求结构体序列化
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'terminalIdentity'  => 'terminal_identity',
        'issueCertType'     => 'issue_cert_type',
        'providerId'        => 'provider_id',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataOwnerName'     => 'data_owner_name',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('issueCertType', $this->issueCertType, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
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
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->issueCertType) {
            $res['issue_cert_type'] = $this->issueCertType;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenCpfCertRequest
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
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['issue_cert_type'])) {
            $model->issueCertType = $map['issue_cert_type'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
