<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BaasUnionInfo extends Model
{
    // 联盟名称
    /**
     * @example name
     *
     * @var string
     */
    public $unionName;

    // 描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $unionDescription;

    // 联系人
    /**
     * @example 联系人
     *
     * @var string
     */
    public $unionUser;

    // 联盟联系人手机号码
    /**
     * @example 联盟联系人手机号码
     *
     * @var string
     */
    public $unionUserCell;

    // 联盟联系人邮箱
    /**
     * @example 联盟联系人邮箱
     *
     * @var string
     */
    public $unionUserMail;
    protected $_name = [
        'unionName'        => 'union_name',
        'unionDescription' => 'union_description',
        'unionUser'        => 'union_user',
        'unionUserCell'    => 'union_user_cell',
        'unionUserMail'    => 'union_user_mail',
    ];

    public function validate()
    {
        Model::validateRequired('unionName', $this->unionName, true);
        Model::validateRequired('unionDescription', $this->unionDescription, true);
        Model::validateRequired('unionUser', $this->unionUser, true);
        Model::validateRequired('unionUserCell', $this->unionUserCell, true);
        Model::validateRequired('unionUserMail', $this->unionUserMail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->unionName) {
            $res['union_name'] = $this->unionName;
        }
        if (null !== $this->unionDescription) {
            $res['union_description'] = $this->unionDescription;
        }
        if (null !== $this->unionUser) {
            $res['union_user'] = $this->unionUser;
        }
        if (null !== $this->unionUserCell) {
            $res['union_user_cell'] = $this->unionUserCell;
        }
        if (null !== $this->unionUserMail) {
            $res['union_user_mail'] = $this->unionUserMail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaasUnionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['union_name'])) {
            $model->unionName = $map['union_name'];
        }
        if (isset($map['union_description'])) {
            $model->unionDescription = $map['union_description'];
        }
        if (isset($map['union_user'])) {
            $model->unionUser = $map['union_user'];
        }
        if (isset($map['union_user_cell'])) {
            $model->unionUserCell = $map['union_user_cell'];
        }
        if (isset($map['union_user_mail'])) {
            $model->unionUserMail = $map['union_user_mail'];
        }

        return $model;
    }
}
