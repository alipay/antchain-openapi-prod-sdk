<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class ImportDataBccCompanyPersonRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 姓名
    /**
     * @var string
     */
    public $xm;

    // 身份证号
    /**
     * @var string
     */
    public $sfzh;

    // 数据更新时间
    /**
     * @var string
     */
    public $sjgxsj;

    // 数据目录名称
    /**
     * @var string
     */
    public $sjmlmc;

    // 数据所属部门
    /**
     * @var string
     */
    public $sjssbm;

    // 从业资格证号
    /**
     * @var string
     */
    public $cyzgzh;

    // 从业类别
    /**
     * @var string
     */
    public $cylb;

    // 聘用单位
    /**
     * @var string
     */
    public $pydw;

    // 公告事由
    /**
     * @var string
     */
    public $ggsy;

    // 公告日期起
    /**
     * @var string
     */
    public $ggrqq;

    // 公告日期止
    /**
     * @var string
     */
    public $ggrqz;

    // 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
    /**
     * @var string
     */
    public $dataName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'xm'                => 'xm',
        'sfzh'              => 'sfzh',
        'sjgxsj'            => 'sjgxsj',
        'sjmlmc'            => 'sjmlmc',
        'sjssbm'            => 'sjssbm',
        'cyzgzh'            => 'cyzgzh',
        'cylb'              => 'cylb',
        'pydw'              => 'pydw',
        'ggsy'              => 'ggsy',
        'ggrqq'             => 'ggrqq',
        'ggrqz'             => 'ggrqz',
        'dataName'          => 'data_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->xm) {
            $res['xm'] = $this->xm;
        }
        if (null !== $this->sfzh) {
            $res['sfzh'] = $this->sfzh;
        }
        if (null !== $this->sjgxsj) {
            $res['sjgxsj'] = $this->sjgxsj;
        }
        if (null !== $this->sjmlmc) {
            $res['sjmlmc'] = $this->sjmlmc;
        }
        if (null !== $this->sjssbm) {
            $res['sjssbm'] = $this->sjssbm;
        }
        if (null !== $this->cyzgzh) {
            $res['cyzgzh'] = $this->cyzgzh;
        }
        if (null !== $this->cylb) {
            $res['cylb'] = $this->cylb;
        }
        if (null !== $this->pydw) {
            $res['pydw'] = $this->pydw;
        }
        if (null !== $this->ggsy) {
            $res['ggsy'] = $this->ggsy;
        }
        if (null !== $this->ggrqq) {
            $res['ggrqq'] = $this->ggrqq;
        }
        if (null !== $this->ggrqz) {
            $res['ggrqz'] = $this->ggrqz;
        }
        if (null !== $this->dataName) {
            $res['data_name'] = $this->dataName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDataBccCompanyPersonRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['xm'])) {
            $model->xm = $map['xm'];
        }
        if (isset($map['sfzh'])) {
            $model->sfzh = $map['sfzh'];
        }
        if (isset($map['sjgxsj'])) {
            $model->sjgxsj = $map['sjgxsj'];
        }
        if (isset($map['sjmlmc'])) {
            $model->sjmlmc = $map['sjmlmc'];
        }
        if (isset($map['sjssbm'])) {
            $model->sjssbm = $map['sjssbm'];
        }
        if (isset($map['cyzgzh'])) {
            $model->cyzgzh = $map['cyzgzh'];
        }
        if (isset($map['cylb'])) {
            $model->cylb = $map['cylb'];
        }
        if (isset($map['pydw'])) {
            $model->pydw = $map['pydw'];
        }
        if (isset($map['ggsy'])) {
            $model->ggsy = $map['ggsy'];
        }
        if (isset($map['ggrqq'])) {
            $model->ggrqq = $map['ggrqq'];
        }
        if (isset($map['ggrqz'])) {
            $model->ggrqz = $map['ggrqz'];
        }
        if (isset($map['data_name'])) {
            $model->dataName = $map['data_name'];
        }

        return $model;
    }
}
