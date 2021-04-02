<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EvidenceBaseModel extends Model
{
    // 业务数据
    /**
     * @example [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
     *
     * @var string
     */
    public $bizData;

    // 证据哈希值
    /**
     * @example "证据哈希值"
     *
     * @var string
     */
    public $hash;

    // 证据附属信息字段
    /**
     * @example "证据附属信息"
     *
     * @var string
     */
    public $metaJson;
    protected $_name = [
        'bizData'  => 'biz_data',
        'hash'     => 'hash',
        'metaJson' => 'meta_json',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->metaJson) {
            $res['meta_json'] = $this->metaJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceBaseModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['meta_json'])) {
            $model->metaJson = $map['meta_json'];
        }

        return $model;
    }
}
