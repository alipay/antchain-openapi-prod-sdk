<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SettleInfo extends Model
{
    // 结算详细信息
    /**
     * @example
     *
     * @var SettleDetailInfo[]
     */
    public $settleDetailInfos;
    protected $_name = [
        'settleDetailInfos' => 'settle_detail_infos',
    ];

    public function validate()
    {
        Model::validateRequired('settleDetailInfos', $this->settleDetailInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->settleDetailInfos) {
            $res['settle_detail_infos'] = [];
            if (null !== $this->settleDetailInfos && \is_array($this->settleDetailInfos)) {
                $n = 0;
                foreach ($this->settleDetailInfos as $item) {
                    $res['settle_detail_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['settle_detail_infos'])) {
            if (!empty($map['settle_detail_infos'])) {
                $model->settleDetailInfos = [];
                $n                        = 0;
                foreach ($map['settle_detail_infos'] as $item) {
                    $model->settleDetailInfos[$n++] = null !== $item ? SettleDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
