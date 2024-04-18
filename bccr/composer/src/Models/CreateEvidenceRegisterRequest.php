<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceRegisterRequest extends Model
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

    // 网页截图id
    /**
     * @var string
     */
    public $screenshotId;

    // 取证名称
    /**
     * @var string
     */
    public $evidenceName;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'screenshotId'      => 'screenshot_id',
        'evidenceName'      => 'evidence_name',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('screenshotId', $this->screenshotId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->screenshotId) {
            $res['screenshot_id'] = $this->screenshotId;
        }
        if (null !== $this->evidenceName) {
            $res['evidence_name'] = $this->evidenceName;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceRegisterRequest
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
        if (isset($map['screenshot_id'])) {
            $model->screenshotId = $map['screenshot_id'];
        }
        if (isset($map['evidence_name'])) {
            $model->evidenceName = $map['evidence_name'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
