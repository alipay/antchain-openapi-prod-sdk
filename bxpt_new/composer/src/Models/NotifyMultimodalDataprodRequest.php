<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class NotifyMultimodalDataprodRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 通知具体json内容
    /**
     * @var string
     */
    public $bizContent;

    // 唯一请求id
    /**
     * @var string
     */
    public $requestId;

    // 业务标识
    /**
     * @var string
     */
    public $bizNo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'bizContent' => 'biz_content',
        'requestId'  => 'request_id',
        'bizNo'      => 'biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyMultimodalDataprodRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }

        return $model;
    }
}
