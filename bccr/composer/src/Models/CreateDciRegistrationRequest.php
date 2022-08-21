<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateDciRegistrationRequest extends Model
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

    // DC456
    /**
     * @var string
     */
    public $dciContentId;

    // 作品创作申明
    /**
     * @var string
     */
    public $creationStatement;

    // 补充授权文件
    /**
     * @var string[]
     */
    public $ancillaryEvidencePathList;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'dciContentId'              => 'dci_content_id',
        'creationStatement'         => 'creation_statement',
        'ancillaryEvidencePathList' => 'ancillary_evidence_path_list',
        'clientToken'               => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('dciContentId', $this->dciContentId, true);
        Model::validateRequired('creationStatement', $this->creationStatement, true);
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
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }
        if (null !== $this->creationStatement) {
            $res['creation_statement'] = $this->creationStatement;
        }
        if (null !== $this->ancillaryEvidencePathList) {
            $res['ancillary_evidence_path_list'] = $this->ancillaryEvidencePathList;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDciRegistrationRequest
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
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }
        if (isset($map['creation_statement'])) {
            $model->creationStatement = $map['creation_statement'];
        }
        if (isset($map['ancillary_evidence_path_list'])) {
            if (!empty($map['ancillary_evidence_path_list'])) {
                $model->ancillaryEvidencePathList = $map['ancillary_evidence_path_list'];
            }
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
