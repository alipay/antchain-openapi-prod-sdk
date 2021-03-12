<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcContent extends Model
{
    // 可验证声明的唯一标识id，status 为 “1” 时候非空
    /**
     * @example 未定义
     *
     * @var string
     */
    public $vcId;

    // 可验证声明完整内容， status 为 “1” 时候非空
    /**
     * @example 声明内容，JSON字符串
     *
     * @var string
     */
    public $vcContent;

    // 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
    /**
     * @example “1”
     *
     * @var string
     */
    public $status;

    // 被颁发当前可验证声明的目标did
    /**
     * @example did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
     *
     * @var string
     */
    public $did;

    // 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
    /**
     * @example “颁发可验证声明失败”
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'vcId'      => 'vc_id',
        'vcContent' => 'vc_content',
        'status'    => 'status',
        'did'       => 'did',
        'message'   => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('vcContent', $this->vcContent, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
