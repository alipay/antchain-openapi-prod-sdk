<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MtmNc extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @example 创建时间
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 修改时间
     *
     * @var int
     */
    public $gmtModified;

    // 主机名
    /**
     * @example 主机名
     *
     * @var string
     */
    public $hostname;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // sn
    /**
     * @example sn
     *
     * @var string
     */
    public $sn;

    // 分组
    /**
     * @example 分组
     *
     * @var string
     */
    public $nodeGroup;

    // cpu_num
    /**
     * @example cpu_num
     *
     * @var int
     */
    public $cpuNum;

    // 内存 M
    /**
     * @example 内存 M
     *
     * @var int
     */
    public $memMega;

    // 磁盘 M
    /**
     * @example 磁盘 M
     *
     * @var int
     */
    public $diskMega;

    // 物理机房
    /**
     * @example 物理机房
     *
     * @var string
     */
    public $idc;

    // 状态
    /**
     * @example 状态
     *
     * @var string
     */
    public $status;

    // 机型
    /**
     * @example 机型
     *
     * @var string
     */
    public $smName;

    // 采集ip
    /**
     * @example 采集ip
     *
     * @var string
     */
    public $collectIp;

    // idc 机房
    /**
     * @example idc 机房
     *
     * @var string
     */
    public $idcName;

    // sigma 集群
    /**
     * @example sigma 集群
     *
     * @var string
     */
    public $cluster;
    protected $_name = [
        'id'          => 'id',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'hostname'    => 'hostname',
        'ip'          => 'ip',
        'sn'          => 'sn',
        'nodeGroup'   => 'node_group',
        'cpuNum'      => 'cpu_num',
        'memMega'     => 'mem_mega',
        'diskMega'    => 'disk_mega',
        'idc'         => 'idc',
        'status'      => 'status',
        'smName'      => 'sm_name',
        'collectIp'   => 'collect_ip',
        'idcName'     => 'idc_name',
        'cluster'     => 'cluster',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('hostname', $this->hostname, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('sn', $this->sn, true);
        Model::validateRequired('nodeGroup', $this->nodeGroup, true);
        Model::validateRequired('cpuNum', $this->cpuNum, true);
        Model::validateRequired('memMega', $this->memMega, true);
        Model::validateRequired('diskMega', $this->diskMega, true);
        Model::validateRequired('idc', $this->idc, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('smName', $this->smName, true);
        Model::validateRequired('collectIp', $this->collectIp, true);
        Model::validateRequired('idcName', $this->idcName, true);
        Model::validateRequired('cluster', $this->cluster, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->nodeGroup) {
            $res['node_group'] = $this->nodeGroup;
        }
        if (null !== $this->cpuNum) {
            $res['cpu_num'] = $this->cpuNum;
        }
        if (null !== $this->memMega) {
            $res['mem_mega'] = $this->memMega;
        }
        if (null !== $this->diskMega) {
            $res['disk_mega'] = $this->diskMega;
        }
        if (null !== $this->idc) {
            $res['idc'] = $this->idc;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->smName) {
            $res['sm_name'] = $this->smName;
        }
        if (null !== $this->collectIp) {
            $res['collect_ip'] = $this->collectIp;
        }
        if (null !== $this->idcName) {
            $res['idc_name'] = $this->idcName;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MtmNc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['node_group'])) {
            $model->nodeGroup = $map['node_group'];
        }
        if (isset($map['cpu_num'])) {
            $model->cpuNum = $map['cpu_num'];
        }
        if (isset($map['mem_mega'])) {
            $model->memMega = $map['mem_mega'];
        }
        if (isset($map['disk_mega'])) {
            $model->diskMega = $map['disk_mega'];
        }
        if (isset($map['idc'])) {
            $model->idc = $map['idc'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sm_name'])) {
            $model->smName = $map['sm_name'];
        }
        if (isset($map['collect_ip'])) {
            $model->collectIp = $map['collect_ip'];
        }
        if (isset($map['idc_name'])) {
            $model->idcName = $map['idc_name'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }

        return $model;
    }
}
