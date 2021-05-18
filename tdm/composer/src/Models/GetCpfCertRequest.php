<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class GetCpfCertRequest extends Model
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

    // 证明文件ID
    /**
     * @var string
     */
    public $issueId;

    // 证明文件存储类型
    /**
     * @var string
     */
    public $fileType;

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'issueId'           => 'issue_id',
        'fileType'          => 'file_type',
        'terminalIdentity'  => 'terminal_identity',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
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
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCpfCertRequest
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
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }

        return $model;
    }
}
