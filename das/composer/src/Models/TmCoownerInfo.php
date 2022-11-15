<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class TmCoownerInfo extends Model
{
    // 共有人中文名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $coownerNameCn;

    // 共有人中文地址
    /**
     * @example 中文地址信息
     *
     * @var string
     */
    public $coownerAddrCn;

    // 共有人英文名称
    /**
     * @example Bob
     *
     * @var string
     */
    public $coownerNameEn;

    // 共有人英文地址
    /**
     * @example 英文地址信息
     *
     * @var string
     */
    public $coownerAddrEn;
    protected $_name = [
        'coownerNameCn' => 'coowner_name_cn',
        'coownerAddrCn' => 'coowner_addr_cn',
        'coownerNameEn' => 'coowner_name_en',
        'coownerAddrEn' => 'coowner_addr_en',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->coownerNameCn) {
            $res['coowner_name_cn'] = $this->coownerNameCn;
        }
        if (null !== $this->coownerAddrCn) {
            $res['coowner_addr_cn'] = $this->coownerAddrCn;
        }
        if (null !== $this->coownerNameEn) {
            $res['coowner_name_en'] = $this->coownerNameEn;
        }
        if (null !== $this->coownerAddrEn) {
            $res['coowner_addr_en'] = $this->coownerAddrEn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TmCoownerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['coowner_name_cn'])) {
            $model->coownerNameCn = $map['coowner_name_cn'];
        }
        if (isset($map['coowner_addr_cn'])) {
            $model->coownerAddrCn = $map['coowner_addr_cn'];
        }
        if (isset($map['coowner_name_en'])) {
            $model->coownerNameEn = $map['coowner_name_en'];
        }
        if (isset($map['coowner_addr_en'])) {
            $model->coownerAddrEn = $map['coowner_addr_en'];
        }

        return $model;
    }
}
