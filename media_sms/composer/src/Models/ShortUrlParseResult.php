<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ShortUrlParseResult extends Model
{
    // 创建短链时传入的客户号，可以用该字段关联短链的发送目标
    /**
     * @example 暂无
     *
     * @var string
     */
    public $custFlag;

    // 卡片模板id
    /**
     * @example 202409050005000000019020
     *
     * @var string
     */
    public $smartTemplateId;

    // 短链地址
    /**
     * @example 暂无
     *
     * @var string
     */
    public $aimUrl;

    // 短链地址尾码
    /**
     * @example 暂无
     *
     * @var string
     */
    public $aimCode;

    // BULK 群发,PERSONAL个性化
    /**
     * @example PERSONAL
     *
     * @var string
     */
    public $aimCodeType;

    // 解析状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 解析状态描述
    /**
     * @example 暂无
     *
     * @var string
     */
    public $describe;
    protected $_name = [
        'custFlag'        => 'cust_flag',
        'smartTemplateId' => 'smart_template_id',
        'aimUrl'          => 'aim_url',
        'aimCode'         => 'aim_code',
        'aimCodeType'     => 'aim_code_type',
        'status'          => 'status',
        'describe'        => 'describe',
    ];

    public function validate()
    {
        Model::validateRequired('custFlag', $this->custFlag, true);
        Model::validateRequired('smartTemplateId', $this->smartTemplateId, true);
        Model::validateRequired('aimUrl', $this->aimUrl, true);
        Model::validateRequired('aimCode', $this->aimCode, true);
        Model::validateRequired('aimCodeType', $this->aimCodeType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->custFlag) {
            $res['cust_flag'] = $this->custFlag;
        }
        if (null !== $this->smartTemplateId) {
            $res['smart_template_id'] = $this->smartTemplateId;
        }
        if (null !== $this->aimUrl) {
            $res['aim_url'] = $this->aimUrl;
        }
        if (null !== $this->aimCode) {
            $res['aim_code'] = $this->aimCode;
        }
        if (null !== $this->aimCodeType) {
            $res['aim_code_type'] = $this->aimCodeType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->describe) {
            $res['describe'] = $this->describe;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShortUrlParseResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cust_flag'])) {
            $model->custFlag = $map['cust_flag'];
        }
        if (isset($map['smart_template_id'])) {
            $model->smartTemplateId = $map['smart_template_id'];
        }
        if (isset($map['aim_url'])) {
            $model->aimUrl = $map['aim_url'];
        }
        if (isset($map['aim_code'])) {
            $model->aimCode = $map['aim_code'];
        }
        if (isset($map['aim_code_type'])) {
            $model->aimCodeType = $map['aim_code_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['describe'])) {
            $model->describe = $map['describe'];
        }

        return $model;
    }
}
