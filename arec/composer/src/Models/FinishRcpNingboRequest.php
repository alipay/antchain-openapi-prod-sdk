<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class FinishRcpNingboRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
    /**
     * @var string
     */
    public $ywh;

    // 不动产单元号，如14-2-1802
    /**
     * @var string
     */
    public $bdcdyh;

    // 不动产登记证明号
    /**
     * @var string
     */
    public $bdcdjzmh;

    // 证明权利或事项
    /**
     * @var string
     */
    public $zmqlhsx;

    // 权利人
    /**
     * @var string
     */
    public $qlr;

    // 义务人
    /**
     * @var string
     */
    public $ywr;

    // 坐落
    /**
     * @var string
     */
    public $zl;

    // 其他
    /**
     * @var string
     */
    public $qt;

    // 附记
    /**
     * @var string
     */
    public $fj;

    // 发证工本号
    /**
     * @var string
     */
    public $fzgbh;

    // 缮证人
    /**
     * @var string
     */
    public $szr;

    // 缮证时间
    /**
     * @var string
     */
    public $szsj;

    // 发证人
    /**
     * @var string
     */
    public $fzr;

    // 发证时间
    /**
     * @var string
     */
    public $fzsj;

    // 发证机关
    /**
     * @var string
     */
    public $fzjg;

    // 区县代码
    /**
     * @var int
     */
    public $qxdm;

    // 省编号
    /**
     * @var string
     */
    public $sbh;

    // 登记证明种类
    /**
     * @var string
     */
    public $djzmzl;

    // 电子版文件字符串
    /**
     * @var string
     */
    public $djzmfile;

    // 债权数额，单位:万元
    /**
     * @var string
     */
    public $zqse;

    // 抵押权起始日期，格式：“yyyy-MM-dd”
    /**
     * @var string
     */
    public $qlqssj;

    // 抵押权结束日期，格式：“yyyy-MM-dd”
    /**
     * @var string
     */
    public $qljssj;

    // 抵押方式
    /**
     * @var string
     */
    public $dyfs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ywh'               => 'ywh',
        'bdcdyh'            => 'bdcdyh',
        'bdcdjzmh'          => 'bdcdjzmh',
        'zmqlhsx'           => 'zmqlhsx',
        'qlr'               => 'qlr',
        'ywr'               => 'ywr',
        'zl'                => 'zl',
        'qt'                => 'qt',
        'fj'                => 'fj',
        'fzgbh'             => 'fzgbh',
        'szr'               => 'szr',
        'szsj'              => 'szsj',
        'fzr'               => 'fzr',
        'fzsj'              => 'fzsj',
        'fzjg'              => 'fzjg',
        'qxdm'              => 'qxdm',
        'sbh'               => 'sbh',
        'djzmzl'            => 'djzmzl',
        'djzmfile'          => 'djzmfile',
        'zqse'              => 'zqse',
        'qlqssj'            => 'qlqssj',
        'qljssj'            => 'qljssj',
        'dyfs'              => 'dyfs',
    ];

    public function validate()
    {
        Model::validateRequired('ywh', $this->ywh, true);
        Model::validateRequired('bdcdyh', $this->bdcdyh, true);
        Model::validateRequired('bdcdjzmh', $this->bdcdjzmh, true);
        Model::validateRequired('zmqlhsx', $this->zmqlhsx, true);
        Model::validateRequired('qlr', $this->qlr, true);
        Model::validateRequired('ywr', $this->ywr, true);
        Model::validateRequired('zl', $this->zl, true);
        Model::validateRequired('fj', $this->fj, true);
        Model::validateRequired('fzgbh', $this->fzgbh, true);
        Model::validateRequired('szr', $this->szr, true);
        Model::validateRequired('szsj', $this->szsj, true);
        Model::validateRequired('fzr', $this->fzr, true);
        Model::validateRequired('fzsj', $this->fzsj, true);
        Model::validateRequired('fzjg', $this->fzjg, true);
        Model::validateRequired('qxdm', $this->qxdm, true);
        Model::validateRequired('sbh', $this->sbh, true);
        Model::validateRequired('djzmzl', $this->djzmzl, true);
        Model::validateRequired('djzmfile', $this->djzmfile, true);
        Model::validateRequired('zqse', $this->zqse, true);
        Model::validateRequired('qlqssj', $this->qlqssj, true);
        Model::validateRequired('qljssj', $this->qljssj, true);
        Model::validateRequired('dyfs', $this->dyfs, true);
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
        if (null !== $this->ywh) {
            $res['ywh'] = $this->ywh;
        }
        if (null !== $this->bdcdyh) {
            $res['bdcdyh'] = $this->bdcdyh;
        }
        if (null !== $this->bdcdjzmh) {
            $res['bdcdjzmh'] = $this->bdcdjzmh;
        }
        if (null !== $this->zmqlhsx) {
            $res['zmqlhsx'] = $this->zmqlhsx;
        }
        if (null !== $this->qlr) {
            $res['qlr'] = $this->qlr;
        }
        if (null !== $this->ywr) {
            $res['ywr'] = $this->ywr;
        }
        if (null !== $this->zl) {
            $res['zl'] = $this->zl;
        }
        if (null !== $this->qt) {
            $res['qt'] = $this->qt;
        }
        if (null !== $this->fj) {
            $res['fj'] = $this->fj;
        }
        if (null !== $this->fzgbh) {
            $res['fzgbh'] = $this->fzgbh;
        }
        if (null !== $this->szr) {
            $res['szr'] = $this->szr;
        }
        if (null !== $this->szsj) {
            $res['szsj'] = $this->szsj;
        }
        if (null !== $this->fzr) {
            $res['fzr'] = $this->fzr;
        }
        if (null !== $this->fzsj) {
            $res['fzsj'] = $this->fzsj;
        }
        if (null !== $this->fzjg) {
            $res['fzjg'] = $this->fzjg;
        }
        if (null !== $this->qxdm) {
            $res['qxdm'] = $this->qxdm;
        }
        if (null !== $this->sbh) {
            $res['sbh'] = $this->sbh;
        }
        if (null !== $this->djzmzl) {
            $res['djzmzl'] = $this->djzmzl;
        }
        if (null !== $this->djzmfile) {
            $res['djzmfile'] = $this->djzmfile;
        }
        if (null !== $this->zqse) {
            $res['zqse'] = $this->zqse;
        }
        if (null !== $this->qlqssj) {
            $res['qlqssj'] = $this->qlqssj;
        }
        if (null !== $this->qljssj) {
            $res['qljssj'] = $this->qljssj;
        }
        if (null !== $this->dyfs) {
            $res['dyfs'] = $this->dyfs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishRcpNingboRequest
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
        if (isset($map['ywh'])) {
            $model->ywh = $map['ywh'];
        }
        if (isset($map['bdcdyh'])) {
            $model->bdcdyh = $map['bdcdyh'];
        }
        if (isset($map['bdcdjzmh'])) {
            $model->bdcdjzmh = $map['bdcdjzmh'];
        }
        if (isset($map['zmqlhsx'])) {
            $model->zmqlhsx = $map['zmqlhsx'];
        }
        if (isset($map['qlr'])) {
            $model->qlr = $map['qlr'];
        }
        if (isset($map['ywr'])) {
            $model->ywr = $map['ywr'];
        }
        if (isset($map['zl'])) {
            $model->zl = $map['zl'];
        }
        if (isset($map['qt'])) {
            $model->qt = $map['qt'];
        }
        if (isset($map['fj'])) {
            $model->fj = $map['fj'];
        }
        if (isset($map['fzgbh'])) {
            $model->fzgbh = $map['fzgbh'];
        }
        if (isset($map['szr'])) {
            $model->szr = $map['szr'];
        }
        if (isset($map['szsj'])) {
            $model->szsj = $map['szsj'];
        }
        if (isset($map['fzr'])) {
            $model->fzr = $map['fzr'];
        }
        if (isset($map['fzsj'])) {
            $model->fzsj = $map['fzsj'];
        }
        if (isset($map['fzjg'])) {
            $model->fzjg = $map['fzjg'];
        }
        if (isset($map['qxdm'])) {
            $model->qxdm = $map['qxdm'];
        }
        if (isset($map['sbh'])) {
            $model->sbh = $map['sbh'];
        }
        if (isset($map['djzmzl'])) {
            $model->djzmzl = $map['djzmzl'];
        }
        if (isset($map['djzmfile'])) {
            $model->djzmfile = $map['djzmfile'];
        }
        if (isset($map['zqse'])) {
            $model->zqse = $map['zqse'];
        }
        if (isset($map['qlqssj'])) {
            $model->qlqssj = $map['qlqssj'];
        }
        if (isset($map['qljssj'])) {
            $model->qljssj = $map['qljssj'];
        }
        if (isset($map['dyfs'])) {
            $model->dyfs = $map['dyfs'];
        }

        return $model;
    }
}
