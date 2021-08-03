<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfDataUseReqSign extends Model
{
    // 机构签名ID
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $mSyAppId;

    // 签名service, 需要颁发
    /**
     * @example TUFHUZ
     *
     * @var string
     */
    public $mSyService;

    // 签名信息
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $mSySign;
    protected $_name = [
        'mSyAppId'   => 'm_sy_app_id',
        'mSyService' => 'm_sy_service',
        'mSySign'    => 'm_sy_sign',
    ];

    public function validate()
    {
        Model::validateRequired('mSyAppId', $this->mSyAppId, true);
        Model::validateRequired('mSyService', $this->mSyService, true);
        Model::validateRequired('mSySign', $this->mSySign, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mSyAppId) {
            $res['m_sy_app_id'] = $this->mSyAppId;
        }
        if (null !== $this->mSyService) {
            $res['m_sy_service'] = $this->mSyService;
        }
        if (null !== $this->mSySign) {
            $res['m_sy_sign'] = $this->mSySign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfDataUseReqSign
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['m_sy_app_id'])) {
            $model->mSyAppId = $map['m_sy_app_id'];
        }
        if (isset($map['m_sy_service'])) {
            $model->mSyService = $map['m_sy_service'];
        }
        if (isset($map['m_sy_sign'])) {
            $model->mSySign = $map['m_sy_sign'];
        }

        return $model;
    }
}
