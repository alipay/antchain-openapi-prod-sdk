<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class ReceiveDrrdataTrackRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 业务数据
    /**
     * @var string
     */
    public $bizContent;

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 运单
    /**
     * @var string
     */
    public $mailNo;

    // 快递公司编码
    /**
     * @var string
     */
    public $cpCode;

    // 自定义标签
    /**
     * @var string
     */
    public $tag;
    protected $_name = [
        'authToken'  => 'auth_token',
        'bizType'    => 'biz_type',
        'bizContent' => 'biz_content',
        'requestId'  => 'request_id',
        'mailNo'     => 'mail_no',
        'cpCode'     => 'cp_code',
        'tag'        => 'tag',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('mailNo', $this->mailNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->mailNo) {
            $res['mail_no'] = $this->mailNo;
        }
        if (null !== $this->cpCode) {
            $res['cp_code'] = $this->cpCode;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiveDrrdataTrackRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['mail_no'])) {
            $model->mailNo = $map['mail_no'];
        }
        if (isset($map['cp_code'])) {
            $model->cpCode = $map['cp_code'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }

        return $model;
    }
}
