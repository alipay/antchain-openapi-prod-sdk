<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TappInfo extends Model
{
    // C3S可信计算TAPP应用标识
    /**
     * @example fafafafaf
     *
     * @var string
     */
    public $taapId;

    // C3S可信计算TAPP版本
    /**
     * @example 1
     *
     * @var int
     */
    public $tappVersion;
    protected $_name = [
        'taapId'      => 'taap_id',
        'tappVersion' => 'tapp_version',
    ];

    public function validate()
    {
        Model::validateRequired('taapId', $this->taapId, true);
        Model::validateRequired('tappVersion', $this->tappVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taapId) {
            $res['taap_id'] = $this->taapId;
        }
        if (null !== $this->tappVersion) {
            $res['tapp_version'] = $this->tappVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TappInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['taap_id'])) {
            $model->taapId = $map['taap_id'];
        }
        if (isset($map['tapp_version'])) {
            $model->tappVersion = $map['tapp_version'];
        }

        return $model;
    }
}
