<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EvidenceStorageReq extends Model
{
    // 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
    /**
     * @example [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
     *
     * @var string
     */
    public $bizData;

    // 不同上链方式
    // 空/"": 默认
    // "TTTS": 溯源
    // "IOTPAY": 支付
    // "CZ": 存证
    // "RAW":文本
    /**
     * @example "CZ"
     *
     * @var string
     */
    public $category;

    // 上链实体id(设备/空间)
    // 不可和project_uid同时为空
    /**
     * @example "did:iot:a9147bd2b83d4732b56dc06b346588f5619f80a2d4d2412fab535cbd37293a00"
     *
     * @var string
     */
    public $iotDid;

    // 需要上链的证据的哈希值
    /**
     * @example "ace1213412313"
     *
     * @var string
     */
    public $hash;

    // 上链的附属信息
    /**
     * @example "附属信息json"
     *
     * @var string
     */
    public $metaJson;

    // 上链的项目id,
    // 不可和iot_did同时为空
    /**
     * @example "上链的项目id"
     *
     * @var string
     */
    public $projectUid;
    protected $_name = [
        'bizData'    => 'biz_data',
        'category'   => 'category',
        'iotDid'     => 'iot_did',
        'hash'       => 'hash',
        'metaJson'   => 'meta_json',
        'projectUid' => 'project_uid',
    ];

    public function validate()
    {
        Model::validateRequired('category', $this->category, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->iotDid) {
            $res['iot_did'] = $this->iotDid;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->metaJson) {
            $res['meta_json'] = $this->metaJson;
        }
        if (null !== $this->projectUid) {
            $res['project_uid'] = $this->projectUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceStorageReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['iot_did'])) {
            $model->iotDid = $map['iot_did'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['meta_json'])) {
            $model->metaJson = $map['meta_json'];
        }
        if (isset($map['project_uid'])) {
            $model->projectUid = $map['project_uid'];
        }

        return $model;
    }
}
