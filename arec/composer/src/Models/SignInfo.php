<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class SignInfo extends Model
{
    // 签署人
    /**
     * @example
     *
     * @var EntityBasicInfo
     */
    public $signer;

    // 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
    /**
     * @example SINGLE_PAGE
     *
     * @var string
     */
    public $signType;

    // 签署页码
    /**
     * @example 1
     *
     * @var int
     */
    public $signPage;

    // 签署x坐标
    /**
     * @example 200.11
     *
     * @var string
     */
    public $signPositionX;

    // 签署y坐标
    /**
     * @example 188.22
     *
     * @var string
     */
    public $signPositionY;
    protected $_name = [
        'signer'        => 'signer',
        'signType'      => 'sign_type',
        'signPage'      => 'sign_page',
        'signPositionX' => 'sign_position_x',
        'signPositionY' => 'sign_position_y',
    ];

    public function validate()
    {
        Model::validateRequired('signer', $this->signer, true);
        Model::validateRequired('signType', $this->signType, true);
        Model::validateRequired('signPage', $this->signPage, true);
        Model::validateRequired('signPositionX', $this->signPositionX, true);
        Model::validateRequired('signPositionY', $this->signPositionY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signer) {
            $res['signer'] = null !== $this->signer ? $this->signer->toMap() : null;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->signPage) {
            $res['sign_page'] = $this->signPage;
        }
        if (null !== $this->signPositionX) {
            $res['sign_position_x'] = $this->signPositionX;
        }
        if (null !== $this->signPositionY) {
            $res['sign_position_y'] = $this->signPositionY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['signer'])) {
            $model->signer = EntityBasicInfo::fromMap($map['signer']);
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['sign_page'])) {
            $model->signPage = $map['sign_page'];
        }
        if (isset($map['sign_position_x'])) {
            $model->signPositionX = $map['sign_position_x'];
        }
        if (isset($map['sign_position_y'])) {
            $model->signPositionY = $map['sign_position_y'];
        }

        return $model;
    }
}
