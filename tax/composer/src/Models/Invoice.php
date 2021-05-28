<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Invoice extends Model
{
    // 备注
    /**
     * @example xxx
     *
     * @var string
     */
    public $bz;

    // 复核人
    /**
     * @example xxx
     *
     * @var string
     */
    public $fhr;

    // 发票代码, 发票代码+发票号码唯一
    /**
     * @example xxx
     *
     * @var string
     */
    public $fpdm;

    // 发票号码,发票代码+发票号码唯一
    /**
     * @example xxx
     *
     * @var string
     */
    public $fphm;

    // 发票类型代码,
    // 默认填:20:广东电子普通发票
    // 01：增值税专用发票
    // 04：增值税普通发票
    // 10：增值税电子普通发票
    // 51：重庆通用机打一联发票76
    // 53：重庆通用机打三联发票210
    // 90：重庆通用机打三联发票190
    /**
     * @example 20
     *
     * @var string
     */
    public $fplx;

    // 发票明细集合
    /**
     * @example xxx
     *
     * @var InvoiceItem[]
     */
    public $fpxxmxs;

    // 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
    /**
     * @example 0
     *
     * @var string
     */
    public $fpztdm;

    // 购买方地址、电话
    /**
     * @example xxx
     *
     * @var string
     */
    public $gfdzdh;

    // 购买方名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $gfmc;

    // 购买方纳税人识别号
    /**
     * @example xxx
     *
     * @var string
     */
    public $gfsh;

    // 购买方银行账号
    /**
     * @example xxx
     *
     * @var string
     */
    public $gfyhzh;

    // 购买方类型,1企业 2个人 3其他
    /**
     * @example 1
     *
     * @var string
     */
    public $gmflx;

    // 金额
    /**
     * @example 20.11
     *
     * @var string
     */
    public $je;

    // 价税合计	， 单位：元（2 位小数）
    /**
     * @example 10.11
     *
     * @var string
     */
    public $jshj;

    // 开票类型,0-蓝字发票；1-红字发票；
    /**
     * @example 1
     *
     * @var string
     */
    public $kplx;

    // 开票人
    /**
     * @example xxx
     *
     * @var string
     */
    public $kpr;

    // 开票日期
    /**
     * @example xxx
     *
     * @var string
     */
    public $kprq;

    // 清单标志,00:无清单 01:有清单
    /**
     * @example 00
     *
     * @var string
     */
    public $qdbz;

    // 认证状态
    /**
     * @example xxx
     *
     * @var string
     */
    public $rzdklbdjgdm;

    // 认证日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $rzdklbdrq;

    // 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
    /**
     * @example 10.11
     *
     * @var string
     */
    public $se;

    // 收款人
    /**
     * @example xxx
     *
     * @var string
     */
    public $skr;

    // 税率标识,0不含税税率；1含税税率
    /**
     * @example 0
     *
     * @var string
     */
    public $slbz;

    // 所属税务机关代码:
    // 山东省343
    // 重庆市350
    // 广东省347
    /**
     * @example 343
     *
     * @var string
     */
    public $ssdq;

    // 销售方地址、电话
    /**
     * @example xxx
     *
     * @var string
     */
    public $xfdzdh;

    // 销售方名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $xfmc;

    // 销售方纳税人识别号
    /**
     * @example xxx
     *
     * @var string
     */
    public $xfsh;

    // 销售方银行账号
    /**
     * @example xxx
     *
     * @var string
     */
    public $xfyhzh;

    // 原发票代码, kplx开票类型为1时必填
    /**
     * @example xxx
     *
     * @var string
     */
    public $yfpdm;

    // 原发票号码,kplx开票类型为1时必填
    /**
     * @example xxx
     *
     * @var string
     */
    public $yfphm;

    // 作废标志,0:未作废，1作废
    /**
     * @example 0
     *
     * @var string
     */
    public $zfbz;

    // 作废时间
    /**
     * @example xxx
     *
     * @var string
     */
    public $zfsj;

    // 扩展字段
    /**
     * @example {abc:123,def:456}
     *
     * @var string
     */
    public $extFiled;
    protected $_name = [
        'bz'          => 'bz',
        'fhr'         => 'fhr',
        'fpdm'        => 'fpdm',
        'fphm'        => 'fphm',
        'fplx'        => 'fplx',
        'fpxxmxs'     => 'fpxxmxs',
        'fpztdm'      => 'fpztdm',
        'gfdzdh'      => 'gfdzdh',
        'gfmc'        => 'gfmc',
        'gfsh'        => 'gfsh',
        'gfyhzh'      => 'gfyhzh',
        'gmflx'       => 'gmflx',
        'je'          => 'je',
        'jshj'        => 'jshj',
        'kplx'        => 'kplx',
        'kpr'         => 'kpr',
        'kprq'        => 'kprq',
        'qdbz'        => 'qdbz',
        'rzdklbdjgdm' => 'rzdklbdjgdm',
        'rzdklbdrq'   => 'rzdklbdrq',
        'se'          => 'se',
        'skr'         => 'skr',
        'slbz'        => 'slbz',
        'ssdq'        => 'ssdq',
        'xfdzdh'      => 'xfdzdh',
        'xfmc'        => 'xfmc',
        'xfsh'        => 'xfsh',
        'xfyhzh'      => 'xfyhzh',
        'yfpdm'       => 'yfpdm',
        'yfphm'       => 'yfphm',
        'zfbz'        => 'zfbz',
        'zfsj'        => 'zfsj',
        'extFiled'    => 'ext_filed',
    ];

    public function validate()
    {
        Model::validateRequired('fpdm', $this->fpdm, true);
        Model::validateRequired('fphm', $this->fphm, true);
        Model::validateRequired('fplx', $this->fplx, true);
        Model::validateRequired('fpztdm', $this->fpztdm, true);
        Model::validateRequired('gfmc', $this->gfmc, true);
        Model::validateRequired('je', $this->je, true);
        Model::validateRequired('jshj', $this->jshj, true);
        Model::validateRequired('kplx', $this->kplx, true);
        Model::validateRequired('kpr', $this->kpr, true);
        Model::validateRequired('kprq', $this->kprq, true);
        Model::validateRequired('slbz', $this->slbz, true);
        Model::validateRequired('ssdq', $this->ssdq, true);
        Model::validateRequired('xfmc', $this->xfmc, true);
        Model::validateRequired('xfsh', $this->xfsh, true);
        Model::validateRequired('zfbz', $this->zfbz, true);
        Model::validateRequired('extFiled', $this->extFiled, true);
        Model::validatePattern('kprq', $this->kprq, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('rzdklbdrq', $this->rzdklbdrq, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('zfsj', $this->zfsj, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bz) {
            $res['bz'] = $this->bz;
        }
        if (null !== $this->fhr) {
            $res['fhr'] = $this->fhr;
        }
        if (null !== $this->fpdm) {
            $res['fpdm'] = $this->fpdm;
        }
        if (null !== $this->fphm) {
            $res['fphm'] = $this->fphm;
        }
        if (null !== $this->fplx) {
            $res['fplx'] = $this->fplx;
        }
        if (null !== $this->fpxxmxs) {
            $res['fpxxmxs'] = [];
            if (null !== $this->fpxxmxs && \is_array($this->fpxxmxs)) {
                $n = 0;
                foreach ($this->fpxxmxs as $item) {
                    $res['fpxxmxs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fpztdm) {
            $res['fpztdm'] = $this->fpztdm;
        }
        if (null !== $this->gfdzdh) {
            $res['gfdzdh'] = $this->gfdzdh;
        }
        if (null !== $this->gfmc) {
            $res['gfmc'] = $this->gfmc;
        }
        if (null !== $this->gfsh) {
            $res['gfsh'] = $this->gfsh;
        }
        if (null !== $this->gfyhzh) {
            $res['gfyhzh'] = $this->gfyhzh;
        }
        if (null !== $this->gmflx) {
            $res['gmflx'] = $this->gmflx;
        }
        if (null !== $this->je) {
            $res['je'] = $this->je;
        }
        if (null !== $this->jshj) {
            $res['jshj'] = $this->jshj;
        }
        if (null !== $this->kplx) {
            $res['kplx'] = $this->kplx;
        }
        if (null !== $this->kpr) {
            $res['kpr'] = $this->kpr;
        }
        if (null !== $this->kprq) {
            $res['kprq'] = $this->kprq;
        }
        if (null !== $this->qdbz) {
            $res['qdbz'] = $this->qdbz;
        }
        if (null !== $this->rzdklbdjgdm) {
            $res['rzdklbdjgdm'] = $this->rzdklbdjgdm;
        }
        if (null !== $this->rzdklbdrq) {
            $res['rzdklbdrq'] = $this->rzdklbdrq;
        }
        if (null !== $this->se) {
            $res['se'] = $this->se;
        }
        if (null !== $this->skr) {
            $res['skr'] = $this->skr;
        }
        if (null !== $this->slbz) {
            $res['slbz'] = $this->slbz;
        }
        if (null !== $this->ssdq) {
            $res['ssdq'] = $this->ssdq;
        }
        if (null !== $this->xfdzdh) {
            $res['xfdzdh'] = $this->xfdzdh;
        }
        if (null !== $this->xfmc) {
            $res['xfmc'] = $this->xfmc;
        }
        if (null !== $this->xfsh) {
            $res['xfsh'] = $this->xfsh;
        }
        if (null !== $this->xfyhzh) {
            $res['xfyhzh'] = $this->xfyhzh;
        }
        if (null !== $this->yfpdm) {
            $res['yfpdm'] = $this->yfpdm;
        }
        if (null !== $this->yfphm) {
            $res['yfphm'] = $this->yfphm;
        }
        if (null !== $this->zfbz) {
            $res['zfbz'] = $this->zfbz;
        }
        if (null !== $this->zfsj) {
            $res['zfsj'] = $this->zfsj;
        }
        if (null !== $this->extFiled) {
            $res['ext_filed'] = $this->extFiled;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Invoice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bz'])) {
            $model->bz = $map['bz'];
        }
        if (isset($map['fhr'])) {
            $model->fhr = $map['fhr'];
        }
        if (isset($map['fpdm'])) {
            $model->fpdm = $map['fpdm'];
        }
        if (isset($map['fphm'])) {
            $model->fphm = $map['fphm'];
        }
        if (isset($map['fplx'])) {
            $model->fplx = $map['fplx'];
        }
        if (isset($map['fpxxmxs'])) {
            if (!empty($map['fpxxmxs'])) {
                $model->fpxxmxs = [];
                $n              = 0;
                foreach ($map['fpxxmxs'] as $item) {
                    $model->fpxxmxs[$n++] = null !== $item ? InvoiceItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fpztdm'])) {
            $model->fpztdm = $map['fpztdm'];
        }
        if (isset($map['gfdzdh'])) {
            $model->gfdzdh = $map['gfdzdh'];
        }
        if (isset($map['gfmc'])) {
            $model->gfmc = $map['gfmc'];
        }
        if (isset($map['gfsh'])) {
            $model->gfsh = $map['gfsh'];
        }
        if (isset($map['gfyhzh'])) {
            $model->gfyhzh = $map['gfyhzh'];
        }
        if (isset($map['gmflx'])) {
            $model->gmflx = $map['gmflx'];
        }
        if (isset($map['je'])) {
            $model->je = $map['je'];
        }
        if (isset($map['jshj'])) {
            $model->jshj = $map['jshj'];
        }
        if (isset($map['kplx'])) {
            $model->kplx = $map['kplx'];
        }
        if (isset($map['kpr'])) {
            $model->kpr = $map['kpr'];
        }
        if (isset($map['kprq'])) {
            $model->kprq = $map['kprq'];
        }
        if (isset($map['qdbz'])) {
            $model->qdbz = $map['qdbz'];
        }
        if (isset($map['rzdklbdjgdm'])) {
            $model->rzdklbdjgdm = $map['rzdklbdjgdm'];
        }
        if (isset($map['rzdklbdrq'])) {
            $model->rzdklbdrq = $map['rzdklbdrq'];
        }
        if (isset($map['se'])) {
            $model->se = $map['se'];
        }
        if (isset($map['skr'])) {
            $model->skr = $map['skr'];
        }
        if (isset($map['slbz'])) {
            $model->slbz = $map['slbz'];
        }
        if (isset($map['ssdq'])) {
            $model->ssdq = $map['ssdq'];
        }
        if (isset($map['xfdzdh'])) {
            $model->xfdzdh = $map['xfdzdh'];
        }
        if (isset($map['xfmc'])) {
            $model->xfmc = $map['xfmc'];
        }
        if (isset($map['xfsh'])) {
            $model->xfsh = $map['xfsh'];
        }
        if (isset($map['xfyhzh'])) {
            $model->xfyhzh = $map['xfyhzh'];
        }
        if (isset($map['yfpdm'])) {
            $model->yfpdm = $map['yfpdm'];
        }
        if (isset($map['yfphm'])) {
            $model->yfphm = $map['yfphm'];
        }
        if (isset($map['zfbz'])) {
            $model->zfbz = $map['zfbz'];
        }
        if (isset($map['zfsj'])) {
            $model->zfsj = $map['zfsj'];
        }
        if (isset($map['ext_filed'])) {
            $model->extFiled = $map['ext_filed'];
        }

        return $model;
    }
}
