<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryResult extends Model
{
    // 工号
    /**
     * @example WB0136222X
     *
     * @var string
     */
    public $workNo;

    // 花名
    /**
     * @example 花名
     *
     * @var string
     */
    public $nickName;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 域账号
    /**
     * @example XXX.xxx
     *
     * @var string
     */
    public $loginAccount;

    // 企业邮箱
    /**
     * @example XXX@antgroup.com
     *
     * @var string
     */
    public $buMail;

    // 人员类型
    /**
     * @example 全职/其他人员/外包/实习/正式
     *
     * @var string
     */
    public $empType;
    protected $_name = [
        'workNo'       => 'work_no',
        'nickName'     => 'nick_name',
        'name'         => 'name',
        'loginAccount' => 'login_account',
        'buMail'       => 'bu_mail',
        'empType'      => 'emp_type',
    ];

    public function validate()
    {
        Model::validateRequired('workNo', $this->workNo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('loginAccount', $this->loginAccount, true);
        Model::validateRequired('buMail', $this->buMail, true);
        Model::validateRequired('empType', $this->empType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->loginAccount) {
            $res['login_account'] = $this->loginAccount;
        }
        if (null !== $this->buMail) {
            $res['bu_mail'] = $this->buMail;
        }
        if (null !== $this->empType) {
            $res['emp_type'] = $this->empType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['login_account'])) {
            $model->loginAccount = $map['login_account'];
        }
        if (isset($map['bu_mail'])) {
            $model->buMail = $map['bu_mail'];
        }
        if (isset($map['emp_type'])) {
            $model->empType = $map['emp_type'];
        }

        return $model;
    }
}
