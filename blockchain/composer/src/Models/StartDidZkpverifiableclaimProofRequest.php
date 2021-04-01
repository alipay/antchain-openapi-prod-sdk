<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidZkpverifiableclaimProofRequest extends Model
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

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // vc对应的授予者
    /**
     * @var string
     */
    public $subject;

    // vc原文
    /**
     * @var string
     */
    public $vc;

    // zkp证明生成信息
    /**
     * @var DidZKPInfo[]
     */
    public $zkpInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'subject'           => 'subject',
        'vc'                => 'vc',
        'zkpInfo'           => 'zkp_info',
    ];

    public function validate()
    {
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('vc', $this->vc, true);
        Model::validateRequired('zkpInfo', $this->zkpInfo, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        if (null !== $this->zkpInfo) {
            $res['zkp_info'] = [];
            if (null !== $this->zkpInfo && \is_array($this->zkpInfo)) {
                $n = 0;
                foreach ($this->zkpInfo as $item) {
                    $res['zkp_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidZkpverifiableclaimProofRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }
        if (isset($map['zkp_info'])) {
            if (!empty($map['zkp_info'])) {
                $model->zkpInfo = [];
                $n              = 0;
                foreach ($map['zkp_info'] as $item) {
                    $model->zkpInfo[$n++] = null !== $item ? DidZKPInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
