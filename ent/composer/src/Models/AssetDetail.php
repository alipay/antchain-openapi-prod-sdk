<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class AssetDetail extends Model
{
    // Token获得类型
    /**
     * @example SHARE | BUY
     *
     * @var string
     */
    public $gainType;

    // Token发放状态
    /**
     * @example PENDING | CONFIRMED
     *
     * @var string
     */
    public $status;

    // 购票数
    /**
     * @example 2
     *
     * @var int
     */
    public $ticketNumber;

    // Token数，单位为分个，1分个=0.01个
    /**
     * @example 1
     *
     * @var int
     */
    public $token;

    // Token展示数
    /**
     * @example 1.41
     *
     * @var string
     */
    public $tokenDisplay;

    // 用户昵称
    /**
     * @example 一个没钱的人
     *
     * @var string
     */
    public $nickname;
    protected $_name = [
        'gainType'     => 'gain_type',
        'status'       => 'status',
        'ticketNumber' => 'ticket_number',
        'token'        => 'token',
        'tokenDisplay' => 'token_display',
        'nickname'     => 'nickname',
    ];

    public function validate()
    {
        Model::validateRequired('gainType', $this->gainType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('ticketNumber', $this->ticketNumber, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('tokenDisplay', $this->tokenDisplay, true);
        Model::validateRequired('nickname', $this->nickname, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gainType) {
            $res['gain_type'] = $this->gainType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->ticketNumber) {
            $res['ticket_number'] = $this->ticketNumber;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->tokenDisplay) {
            $res['token_display'] = $this->tokenDisplay;
        }
        if (null !== $this->nickname) {
            $res['nickname'] = $this->nickname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gain_type'])) {
            $model->gainType = $map['gain_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['ticket_number'])) {
            $model->ticketNumber = $map['ticket_number'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['token_display'])) {
            $model->tokenDisplay = $map['token_display'];
        }
        if (isset($map['nickname'])) {
            $model->nickname = $map['nickname'];
        }

        return $model;
    }
}
