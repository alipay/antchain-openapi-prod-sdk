<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcShareStruct extends Model
{
    // 分享的目标VC的id
    /**
     * @example 未定义
     *
     * @var string
     */
    public $vcId;

    // 目标的VC持有者的did
    /**
     * @example did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
     *
     * @var string
     */
    public $ownerDid;

    // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
    /**
     * @example { "Item1": "1", "学历信息": [ { "学历": "0", "毕业院校": "0", "专业": "0", "Item2":"1", }, "1", ], "Item3":"1" }
     *
     * @var string
     */
    public $index;

    // 非托管模式下owner_did的签名，作为授权凭证
    /**
     * @example jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe
     * mx4xYCqX0gE=
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'vcId'      => 'vc_id',
        'ownerDid'  => 'owner_did',
        'index'     => 'index',
        'signature' => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('ownerDid', $this->ownerDid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcShareStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
