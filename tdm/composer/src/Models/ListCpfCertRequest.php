<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ListCpfCertRequest extends Model
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

    // 身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 证明类型
    /**
     * @var string
     */
    public $issueCertType;

    // 当前页码，默认1
    /**
     * @var int
     */
    public $currentPage;

    // 每页展示数量，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 时间筛选枚举类型，默认全部
    /**
     * @var string
     */
    public $optionTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'terminalIdentity'  => 'terminal_identity',
        'dataOwnerIdentity' => 'data_owner_identity',
        'issueCertType'     => 'issue_cert_type',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
        'optionTime'        => 'option_time',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('issueCertType', $this->issueCertType, true);
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
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->issueCertType) {
            $res['issue_cert_type'] = $this->issueCertType;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->optionTime) {
            $res['option_time'] = $this->optionTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCpfCertRequest
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
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['issue_cert_type'])) {
            $model->issueCertType = $map['issue_cert_type'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['option_time'])) {
            $model->optionTime = $map['option_time'];
        }

        return $model;
    }
}
