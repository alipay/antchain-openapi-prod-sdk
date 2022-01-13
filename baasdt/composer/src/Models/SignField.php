<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SignField extends Model
{
    // 签署操作人个人账号标识，即操作本次签署的个人
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16...
     *
     * @var string
     */
    public $accountId;

    // 签署所在页码，必须是整数数字
    /**
     * @example 5
     *
     * @var string
     */
    public $posPage;

    // x坐标，必须是数字
    /**
     * @example 510.2362
     *
     * @var string
     */
    public $posX;

    // y坐标，必须是数字
    /**
     * @example 456.5826
     *
     * @var string
     */
    public $posY;
    protected $_name = [
        'accountId' => 'account_id',
        'posPage'   => 'pos_page',
        'posX'      => 'pos_x',
        'posY'      => 'pos_y',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->posPage) {
            $res['pos_page'] = $this->posPage;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['pos_page'])) {
            $model->posPage = $map['pos_page'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }

        return $model;
    }
}
