<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserVirtualAccountInfoBO extends Model
{
    // 虚拟子账户ID
    /**
     * @example 34814bfc9b2a40d3889222013228dd02
     *
     * @var string
     */
    public $subUserVirtualAccountId;

    // 虚拟子账号对应用户ID
    /**
     * @example 8fa693da457449cf9bce00ef207d7407
     *
     * @var string
     */
    public $virtualAccountUserId;

    // 虚拟子账户邮箱
    /**
     * @example test@gamil.com
     *
     * @var string
     */
    public $email;

    // 别名
    /**
     * @example alias
     *
     * @var string
     */
    public $alias;
    protected $_name = [
        'subUserVirtualAccountId' => 'sub_user_virtual_account_id',
        'virtualAccountUserId'    => 'virtual_account_user_id',
        'email'                   => 'email',
        'alias'                   => 'alias',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subUserVirtualAccountId) {
            $res['sub_user_virtual_account_id'] = $this->subUserVirtualAccountId;
        }
        if (null !== $this->virtualAccountUserId) {
            $res['virtual_account_user_id'] = $this->virtualAccountUserId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserVirtualAccountInfoBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_user_virtual_account_id'])) {
            $model->subUserVirtualAccountId = $map['sub_user_virtual_account_id'];
        }
        if (isset($map['virtual_account_user_id'])) {
            $model->virtualAccountUserId = $map['virtual_account_user_id'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }

        return $model;
    }
}
