<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AuthInfo extends Model
{
    // 授权权利项
    /**
     * @example 授权权利项
     *
     * @var string
     */
    public $rightCode;

    // 许可地域，默认中国境内，不包括香港等
    /**
     * @example 全世界
     *
     * @var string
     */
    public $regionCode;

    // 许可方式
    /**
     * @example 广播
     *
     * @var string
     */
    public $usageCode;

    // 许可终端
    /**
     * @example 电视
     *
     * @var string
     */
    public $terminalCode;

    // 传播媒介，默认互联网
    /**
     * @example 互联网
     *
     * @var string
     */
    public $mediaCode;

    // 是否独占,默认 普通专有 GENERAL
    /**
     * @example GENERAL
     *
     * @var string
     */
    public $rightItemCharacter;

    // 是否可转让,默认不可转让
    /**
     * @example ENABLE
     *
     * @var string
     */
    public $transferStatus;
    protected $_name = [
        'rightCode'          => 'right_code',
        'regionCode'         => 'region_code',
        'usageCode'          => 'usage_code',
        'terminalCode'       => 'terminal_code',
        'mediaCode'          => 'media_code',
        'rightItemCharacter' => 'right_item_character',
        'transferStatus'     => 'transfer_status',
    ];

    public function validate()
    {
        Model::validateRequired('rightCode', $this->rightCode, true);
        Model::validateRequired('usageCode', $this->usageCode, true);
        Model::validateRequired('terminalCode', $this->terminalCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rightCode) {
            $res['right_code'] = $this->rightCode;
        }
        if (null !== $this->regionCode) {
            $res['region_code'] = $this->regionCode;
        }
        if (null !== $this->usageCode) {
            $res['usage_code'] = $this->usageCode;
        }
        if (null !== $this->terminalCode) {
            $res['terminal_code'] = $this->terminalCode;
        }
        if (null !== $this->mediaCode) {
            $res['media_code'] = $this->mediaCode;
        }
        if (null !== $this->rightItemCharacter) {
            $res['right_item_character'] = $this->rightItemCharacter;
        }
        if (null !== $this->transferStatus) {
            $res['transfer_status'] = $this->transferStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['right_code'])) {
            $model->rightCode = $map['right_code'];
        }
        if (isset($map['region_code'])) {
            $model->regionCode = $map['region_code'];
        }
        if (isset($map['usage_code'])) {
            $model->usageCode = $map['usage_code'];
        }
        if (isset($map['terminal_code'])) {
            $model->terminalCode = $map['terminal_code'];
        }
        if (isset($map['media_code'])) {
            $model->mediaCode = $map['media_code'];
        }
        if (isset($map['right_item_character'])) {
            $model->rightItemCharacter = $map['right_item_character'];
        }
        if (isset($map['transfer_status'])) {
            $model->transferStatus = $map['transfer_status'];
        }

        return $model;
    }
}
